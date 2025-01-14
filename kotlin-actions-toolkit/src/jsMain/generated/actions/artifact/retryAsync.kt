// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import actions.http.client.HttpClientResponse
import js.collections.ReadonlyMap
import kotlin.js.Promise

@JsName("retry")
external fun retryAsync(
    name: String,
    operation: () -> Promise<HttpClientResponse>,
    customErrorMessages: ReadonlyMap<Int, String>,
    maxAttempts: Number,
): Promise<HttpClientResponse>
