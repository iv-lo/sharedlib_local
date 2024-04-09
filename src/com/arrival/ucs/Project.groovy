package com.arrival.ucs


class Project extends ProjectClazz {
    Project(def pipeline, String project, String version, String commit) {
        super(pipeline)
        this.project = project
        this.version = version
        this.commit = commit
    }
}