/**
 * Copyright 2012-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
 * except in compliance with the License. A copy of the License is located at
 *
 *     http://aws.amazon.com/apache2.0/
 *
 * or in the "LICENSE.TXT" file accompanying this file. This file is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under the License.
 */

package org.apache.hadoop.dynamodb.write;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.dynamodb.DynamoDBItemWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.util.Progressable;

import java.io.IOException;

public class DefaultDynamoDBRecordWriter extends AbstractDynamoDBRecordWriter<Text,
    DynamoDBItemWritable> {
  private static final Log log = LogFactory.getLog(DefaultDynamoDBRecordWriter.class);

  public DefaultDynamoDBRecordWriter(JobConf jobConf, Progressable progress) throws IOException {
    super(jobConf, progress);
    log.info("### DefaultDynamoDBRecordWriter");
  }

  @Override
  public DynamoDBItemWritable convertValueToDynamoDBItem(Text key, DynamoDBItemWritable value) {
    return value;
  }
}
