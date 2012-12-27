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

import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Metric;
import org.sonar.api.measures.Metrics;

import java.util.Arrays;
import java.util.List;

public final class ${pluginKey}Metrics implements Metrics {

  // Modify the following metrics (variable name, attributes) to fit your plugin needs

  // This metric is used by Sensor
  public static final Metric MYMETRIC = new Metric.Builder("metric_key", "Metric Name", Metric.ValueType.STRING)
      .setDescription("Metric description")
      .setDirection(Metric.DIRECTION_WORST)
      .setQualitative(false)
      .setDomain(CoreMetrics.DOMAIN_GENERAL)
      .create();

  // This metric is used by Decorator
  public static final Metric RANDOM = new Metric.Builder("random", "Random", Metric.ValueType.FLOAT)
      .setDescription("Random value")
      .setDirection(Metric.DIRECTION_BETTER)
      .setQualitative(false)
      .setDomain(CoreMetrics.DOMAIN_GENERAL)
      .create();

  // getMetrics() method is defined in the Metrics interface and is used by
  // Sonar to retrieve the list of new metrics
  public List<Metric> getMetrics() {
    return Arrays.asList(MYMETRIC,RANDOM);
  }
}
