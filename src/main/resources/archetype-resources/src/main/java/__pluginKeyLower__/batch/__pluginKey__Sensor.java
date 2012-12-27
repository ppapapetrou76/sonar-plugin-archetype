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
package ${package}.batch;

import ${package}.${pluginKey}Metrics;
import org.sonar.api.batch.Sensor;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.measures.Measure;
import org.sonar.api.resources.Project;

public class ${pluginKey}Sensor implements Sensor {

  public boolean shouldExecuteOnProject(Project project) {
    // This sensor is executed on any type of projects
    // Modify the code if the sensor should be executed based on a condition
    return true;
  }

  public void analyse(Project project, SensorContext sensorContext) {
    Measure measure = new Measure(${pluginKey}Metrics.MYMETRIC, "Hello World from ${pluginKey} plugin!");
    sensorContext.saveMeasure(measure);
  }
}
