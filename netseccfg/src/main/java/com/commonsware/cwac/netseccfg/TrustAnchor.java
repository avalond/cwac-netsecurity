/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.commonsware.cwac.netseccfg;

import java.security.cert.X509Certificate;

/** @hide */
public final class TrustAnchor {
  public final X509Certificate certificate;
  public final boolean overridesPins;

  public TrustAnchor(X509Certificate certificate, boolean overridesPins) {
    if (certificate == null) {
      throw new NullPointerException("certificate");
    }
    this.certificate = certificate;
    this.overridesPins = overridesPins;
  }
}
