/*
 * Copyright 1999-2004 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.el;

import java.util.Map;
import javax.servlet.jsp.el.ELException;
import javax.servlet.jsp.el.VariableResolver;
import javax.servlet.jsp.el.FunctionMapper;

/**
 *
 * <p>An expression representing a literal value
 * 
 * @author Nathan Abramson - Art Technology Group
 * @author Shawn Bayern
 * @version $Change: 181177 $$DateTime: 2001/06/26 08:45:09 $$Author$
 **/

public abstract class Literal
  extends Expression
{
  //-------------------------------------
  // Properties
  //-------------------------------------
  // property value

  Object mValue;
  public Object getValue ()
  { return mValue; }
  public void setValue (Object pValue)
  { mValue = pValue; }

  //-------------------------------------
  /**
   *
   * Constructor
   **/
  public Literal (Object pValue)
  {
    mValue = pValue;
  }

  //-------------------------------------
  // Expression methods
  //-------------------------------------
  /**
   *
   * Evaluates to the literal value
   **/
  public Object evaluate (VariableResolver pResolver, FunctionMapper functions)
    throws ELException
  {
    return mValue;
  }

  //-------------------------------------
}
