package com.makeit.app.dto.challenge;

public class CheckInResponse {

    private String message;
    private Long challengeId;
    private boolean completado;

    public CheckInResponse(String message, Long challengeId, boolean completado) {
        this.message = message;
        this.challengeId = challengeId;
        this.completado = completado;
    }

    public String getMessage() {
        return message;
    }

    public Long getChallengeId() {
        return challengeId;
    }

    public boolean isCompletado() {
        return completado;
    }
}
