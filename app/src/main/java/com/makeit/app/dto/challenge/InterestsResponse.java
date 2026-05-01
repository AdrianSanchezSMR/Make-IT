package com.makeit.app.dto.challenge;

import java.util.List;

public class InterestsResponse {

    private List<Long> categoriaIds;

    public InterestsResponse(List<Long> categoriaIds) {
        this.categoriaIds = categoriaIds;
    }

    public List<Long> getCategoriaIds() {
        return categoriaIds;
    }
}
