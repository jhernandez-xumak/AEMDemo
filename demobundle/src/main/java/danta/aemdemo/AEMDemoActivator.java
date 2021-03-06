/**
 * Danta AEM Bundle
 *
 * Copyright (C) 2017 Tikal Technologies, Inc. All rights reserved.
 *
 * Licensed under GNU Affero General Public License, Version v3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.gnu.org/licenses/agpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied;
 * without even the implied warranty of MERCHANTABILITY.
 * See the License for more details.
 */

package danta.aemdemo;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AEM Demo Bundle Activator.
 *
 * @author      snim
 * @version     1.0.0
 * @since       2017-08-08
 */
public class AEMDemoActivator
        implements BundleActivator {

    // Private variables
    private final Logger log = LoggerFactory.getLogger(getClass());

    public void start(BundleContext bundleContext)
            throws Exception {
        log.info("AEM Demo - Activated!!!");
    }

    public void stop(BundleContext bundleContext)
            throws Exception {
        log.info("AEM Demo - DeActivated!!!");
    }

}
