/*
 * Copyright (c) 2016  W.I.S.V. 'Christiaan Huygens'
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ch.wisv.areafiftylan.security.token;

import ch.wisv.areafiftylan.users.model.User;

import javax.persistence.Entity;

/**
 * Created by Sille Kamoen on 6-5-16.
 */
@Entity
public class AuthenticationToken extends Token {

    // Default 5 days validity
    private static final int EXPIRATION = 60 * 24 * 5;

    public AuthenticationToken() {
        // JPA ONLY
    }

    public AuthenticationToken(User user) {
        super(user, EXPIRATION);
    }
}
