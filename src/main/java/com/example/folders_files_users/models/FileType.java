package com.example.folders_files_users.models;

public enum FileType {
    TEXT(".txt"),
    RUBY(".rb"),
    JAVA(".java"),
    PYTHON(".py"),
    POWERPOINT(".ppt");

    private final String extension;

    FileType(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }
}
