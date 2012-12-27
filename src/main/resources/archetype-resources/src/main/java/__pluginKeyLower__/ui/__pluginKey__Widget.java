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
package ${package}.ui;

import org.sonar.api.web.*;


// Modify or remove annotations to fit your plugin needs
@UserRole(UserRole.USER)
@Description("My Widget")
@WidgetCategory("Widget Category")
@WidgetProperties({
    @WidgetProperty(key = "param1",
        description = "This is a mandatory parameter",
        optional = false
    ),
    @WidgetProperty(key = "max",
        description = "This is a parameter with a type and default value",
        type = WidgetPropertyType.INTEGER,
        defaultValue = "80"
    ),
    @WidgetProperty(key = "param2",
        description = "This is an optional parameter"
    ),
})
public class ${pluginKey}Widget extends AbstractRubyTemplate implements RubyRailsWidget {

  public String getId() {
    return "${pluginKey}Widget";
  }

  public String getTitle() {
    return "${pluginKey}Widget";
  }

  @Override
  protected String getTemplatePath() {
    return "/${pluginKeyLower}/${pluginKeyLower}_widget.html.erb";
  }
}