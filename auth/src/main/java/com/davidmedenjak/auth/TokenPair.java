package com.davidmedenjak.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/** Login credentials for the user. */
@SuppressWarnings("WeakerAccess")
public class TokenPair {

    @NonNull public final String accessToken;
    @Nullable public final String refreshToken;

    /**
     * Create new credentials for the user.
     *
     * @param accessToken used to authenticate the user with the backend
     * @param refreshToken if set, provides credentials to refresh the access token once it becomes
     *     invalidated
     */
    public TokenPair(@NonNull String accessToken, @Nullable String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }
}
