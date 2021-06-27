package com.coding.cloud.mall.auth.domain;

import com.coding.cloud.mall.common.domain.UserDto;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
@Data
public class SecurityUser implements UserDetails {
    private Long id;
    private String username;
    private String password;
    private Boolean enabled;
    private String clientId;
    private Collection<SimpleGrantedAuthority> authorities;

    public SecurityUser(UserDto userDto) {
        this.setId(userDto.getId());
        this.setUsername(userDto.getUsername());
        this.setPassword(userDto.getPassword());
        this.setEnabled(userDto.getStatus() == 1);
        this.setClientId(userDto.getClientId());
        if (userDto.getRoles() != null) {
            authorities = new ArrayList<>();
            userDto.getRoles().forEach(item -> authorities.add(new SimpleGrantedAuthority(item)));
        }

    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
}