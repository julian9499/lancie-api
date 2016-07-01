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

package ch.wisv.areafiftylan.dto;

import ch.wisv.areafiftylan.model.util.Gender;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

public class ProfileDTO {

    @NotNull @Getter @Setter
    private Gender gender;

    @NotEmpty @Getter @Setter
    private String address = "";

    @NotEmpty @Getter @Setter
    private String zipcode = "";

    @NotEmpty @Getter @Setter
    private String city = "";

    @NotEmpty @Getter @Setter
    private String phoneNumber = "";

    @Getter @Setter
    private String notes = "";

    @NotEmpty @Getter @Setter
    private String firstName = "";

    @NotEmpty @Getter @Setter
    private String lastName = "";

    @Getter @Setter
    private String displayName = "";
}
