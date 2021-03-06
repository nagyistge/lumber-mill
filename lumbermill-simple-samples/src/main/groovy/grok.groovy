/*
 * Copyright 2016 Sony Mobile Communications, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
import lumbermill.Core
import lumbermill.api.Codecs
import lumbermill.api.JsonEvent
import rx.Observable

import static lumbermill.Core.*

/*
 * Simple grok, will result in:
 *
 * {
 *    "message" : "1 times",
 *    "@timestamp" : "2016-06-20T08:18:28.283+02:00",
 *    "number" : 1,
 *    "text" : "times"
 * }
 * It says 1 in field number
 * </pre>
*/

Codecs.TEXT_TO_JSON.from("1 times").toObservable()
    .flatMap (
        Core.grok.parse (
            field       : 'message',
            pattern     : '%{NUMBER:number:int} %{WORD:text}',
            tagOnFailure: true
        )
    )
    .doOnNext(console.stdout())
    .doOnNext(console.stdout('It says {number} in field number'))
    .toBlocking()
    .subscribe()

