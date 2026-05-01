package com.makeit.app.dto.challenge;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class UpdateInterestsRequest {

    @NotEmpty
    private List<@NotNull Long> categoriaIds;

    public List<Long> getCategoriaIds() {
        return categoriaIds;
    }

    public void setCategoriaIds(List<Long> categoriaIds) {
        this.categoriaIds = categoriaIds;
    }
}
