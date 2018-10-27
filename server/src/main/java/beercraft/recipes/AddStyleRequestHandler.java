package beercraft.recipes;

import beercraft.util.*;

import java.io.IOException;

public class AddStyleRequestHandler implements RequestHandler {
    /**
     * Handles a request that was dispatched by the main Lambda handler.
     *
     * @param requestData The request body and query parameters
     * @return The response
     */
    public Response handleRequest(RequestData requestData) throws IOException {
        // TODO: Validate the input.

        return new AddItemRequestHandler(Style.class).handleRequest(requestData);
    }
}