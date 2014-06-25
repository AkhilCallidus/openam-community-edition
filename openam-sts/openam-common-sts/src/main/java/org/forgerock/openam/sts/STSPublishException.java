/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions Copyrighted [year] [name of copyright owner]".
 *
 * Copyright 2014 ForgeRock AS. All rights reserved.
 */

package org.forgerock.openam.sts;

import org.forgerock.json.resource.ResourceException;

/**
 * Exception thrown for actions related to publishing, removing, or reading STS instances.
 */
public class STSPublishException extends ResourceException {
    public STSPublishException(int code, String message) {
        super(code, message);
    }
    public STSPublishException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }

}
