/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lambda.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Create Event Source Mapping Result JSON Unmarshaller
 */
public class CreateEventSourceMappingResultJsonUnmarshaller implements Unmarshaller<CreateEventSourceMappingResult, JsonUnmarshallerContext> {

    public CreateEventSourceMappingResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateEventSourceMappingResult createEventSourceMappingResult = new CreateEventSourceMappingResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("UUID", targetDepth)) {
                    context.nextToken();
                    createEventSourceMappingResult.setUUID(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BatchSize", targetDepth)) {
                    context.nextToken();
                    createEventSourceMappingResult.setBatchSize(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EventSourceArn", targetDepth)) {
                    context.nextToken();
                    createEventSourceMappingResult.setEventSourceArn(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FunctionArn", targetDepth)) {
                    context.nextToken();
                    createEventSourceMappingResult.setFunctionArn(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModified", targetDepth)) {
                    context.nextToken();
                    createEventSourceMappingResult.setLastModified(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastProcessingResult", targetDepth)) {
                    context.nextToken();
                    createEventSourceMappingResult.setLastProcessingResult(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    createEventSourceMappingResult.setState(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StateTransitionReason", targetDepth)) {
                    context.nextToken();
                    createEventSourceMappingResult.setStateTransitionReason(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return createEventSourceMappingResult;
    }

    private static CreateEventSourceMappingResultJsonUnmarshaller instance;
    public static CreateEventSourceMappingResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new CreateEventSourceMappingResultJsonUnmarshaller();
        return instance;
    }
}
    