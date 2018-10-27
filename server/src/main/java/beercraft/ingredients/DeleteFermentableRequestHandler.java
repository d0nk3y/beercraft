package beercraft.ingredients;

import beercraft.util.*;

import java.io.IOException;

public class DeleteFermentableRequestHandler implements RequestHandler {
    /**
     * Handles a request that was dispatched by the main Lambda handler.
     *
     * @param requestData The request body and query parameters
     * @return The response
     */
    public Response handleRequest(RequestData requestData) throws IOException, InstantiationException, IllegalAccessException {
        return new DeleteItemRequestHandler<>(Fermentable.class).handleRequest(requestData);
    }
}
