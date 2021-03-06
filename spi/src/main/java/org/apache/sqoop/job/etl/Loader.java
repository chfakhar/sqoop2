/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sqoop.job.etl;

import org.apache.sqoop.common.ImmutableContext;
import org.apache.sqoop.job.io.DataReader;

/**
 * This allows connector to load data into a target system.
 */
public abstract class Loader<ConnectionConfiguration, JobConfiguration> {

  /**
   * Load data to target.
   *
   * @param context Context object
   * @param connectionConfiguration Connection configuration
   * @param jobConfiguration Job configuration
   * @param reader Data reader object
   * @throws Exception
   */
  public abstract void load(ImmutableContext context,
                            ConnectionConfiguration connectionConfiguration,
                            JobConfiguration jobConfiguration,
                            DataReader reader) throws Exception;

}
