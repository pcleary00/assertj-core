/*
 * Created on Sep 26, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.assertj.core.error;

import static junit.framework.Assert.assertEquals;

import static org.assertj.core.error.ShouldBeInSameDay.shouldBeInSameDay;
import static org.assertj.core.util.Dates.parse;

import org.assertj.core.description.*;
import org.assertj.core.presentation.StandardRepresentation;
import org.junit.Test;


/**
 * Tests for <code>{@link ShouldBeInSameDay#create(Description, org.assertj.core.presentation.Representation)}</code>.
 * 
 * @author Joel Costigliola
 */
public class ShouldBeInSameDay_create_Test {

  @Test
  public void should_create_error_message() {
    ErrorMessageFactory factory = shouldBeInSameDay(parse("2010-01-01"), parse("2010-01-25"));
    String message = factory.create(new TextDescription("Test"), new StandardRepresentation());
    assertEquals("[Test] \nExpecting:\n <2010-01-01T00:00:00>\nto be on same year, month and day as:\n <2010-01-25T00:00:00>", message);
  }

}
