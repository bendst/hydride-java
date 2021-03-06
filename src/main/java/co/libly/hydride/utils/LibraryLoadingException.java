/*
 * Copyright (c) Libly - Terl Tech Ltd  • 04/08/2019, 22:48 • libly.co, goterl.com
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at http://mozilla.org/MPL/2.0/.
 */

package co.libly.hydride.utils;

/**
 * Indicates a failure to load the required library.
 */
public class LibraryLoadingException extends RuntimeException {

    public LibraryLoadingException(String message) {
        super(message);
    }

    public LibraryLoadingException(String message, Throwable cause) {
        super(message, cause);
    }
}