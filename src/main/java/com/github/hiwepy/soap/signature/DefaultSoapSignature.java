/*
 * Copyright (c) 2018, hiwepy (https://github.com/hiwepy).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.github.hiwepy.soap.signature;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;

public class DefaultSoapSignature implements SoapSignature {

	@Override
	public void sign(SOAPHeader header, String namespace) throws SOAPException {
		// TODO Auto-generated method stub

        QName hname = new QName(namespace, "username", "nn");  
        header.addHeaderElement(hname).setValue("huoyangege");  

	}

	@Override
	public void sign(SOAPBody body, String namespace) throws SOAPException{
		// TODO Auto-generated method stub

	}

}
