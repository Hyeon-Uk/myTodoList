package com.hyeonuk.todo.member.dto;

import lombok.*;

public class LoginDTO {
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class Request{
        private String id;
        private String password;

        public void setId(String id) {
            if(id!=null) {
                this.id = id.trim();
            }
        }
    }

    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class Response{
        private String accessToken;
    }
}
