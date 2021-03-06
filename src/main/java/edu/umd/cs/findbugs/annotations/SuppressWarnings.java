package edu.umd.cs.findbugs.annotations;
/*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*  http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * The set of warnings that are to be suppressed by the compiler in the annotated element. Duplicate names are
 * permitted. The second and successive occurrences of a name are ignored. The presence of unrecognized warning
 * names is not an error: Compilers must ignore any warning names they do not recognize. They are, however,
 * free to emit a warning if an annotation contains an unrecognized warning name.
 * Compiler vendors should document the warning names they support in conjunction with this annotation type. They
 * are encouraged to cooperate to ensure that the same names work across multiple compilers.
 */
@Target(value = {TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, PACKAGE})
@Retention(value = CLASS)
public @interface SuppressWarnings {
    /**
     * The name of the warning. More than one name can be specified.
     *
     * @return The name of the warning. More than one name can be specified.
     */
    String[] value() default {};

    /**
     * Reason why the warning should be ignored.
     *
     * @return Reason why the warning should be ignored.
     */
    String justification() default "";
}
