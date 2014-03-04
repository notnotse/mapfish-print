/*
 * Copyright (C) 2014  Camptocamp
 *
 * This file is part of MapFish Print
 *
 * MapFish Print is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MapFish Print is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MapFish Print.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mapfish.print.attribute;

import org.json.JSONException;
import org.json.JSONWriter;
import org.mapfish.print.config.ConfigurationObject;
import org.mapfish.print.json.PJsonObject;

/**
 * Represents an attribute passed in from a web-client to be used to populate the report.
 *
 * Created by Jesse on 2/21/14.
 */
public interface Attribute  extends ConfigurationObject {
    Object getValue(PJsonObject values, String name);

    public void printClientConfig(JSONWriter json) throws JSONException;
}
