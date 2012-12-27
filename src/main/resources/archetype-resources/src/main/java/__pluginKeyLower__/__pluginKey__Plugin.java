#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * ${pluginName}
 * Copyright (C) ${inceptionYear} ${organizationName}
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
 package ${package};

import ${package}.batch.${pluginKey}Decorator;
import ${package}.batch.${pluginKey}Sensor;
import ${package}.ui.${pluginKey}Widget;
import org.sonar.api.Properties;
import org.sonar.api.Property;
import org.sonar.api.SonarPlugin;

import java.util.Arrays;
import java.util.List;

/**
 * This class is the entry point for all extensions
 */
@Properties({
    @Property(
        key = ${pluginKey}Plugin.MY_PROPERTY,
        name = "Plugin Property",
        description = "A property for the plugin")})
public final class ${pluginKey}Plugin extends SonarPlugin {

  // modify the following property (variable name, value) to fit your plugin needs
  public static final String MY_PROPERTY = "sonar.${pluginKeyLower}.myproperty";

  // This is where you're going to declare all your Sonar extensions
  public List getExtensions() {
    return Arrays.asList(
        // Definitions
        ${pluginKey}Metrics.class,

        // Batch
        ${pluginKey}Sensor.class, ${pluginKey}Decorator.class,

        // UI
        ${pluginKey}Widget.class);
  }
}