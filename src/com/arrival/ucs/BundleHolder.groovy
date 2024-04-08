package com.arrival.ucs

// import groovy.json.JsonSlurper


class BundleHolder {
    private String name

    BundleHolder(String name) {
        this.name = name
    }
    // String initBundles = """ extends BundleHolderClazz
    //         {
    //     "Van_1": [
    //         {"//vehicle1": "0.0.9.0"},
    //         {"//vehicle2": "0.0.9.0"}
    //     ],
    //     "Van_2": [
    //         {"//vehicle1": "0.2.0.0"}
    //     ],
    //     "Van_3": [
    //         {"//vehicle1": "0.13.0.2"},
    //         {"//vehicle2": "0.5.0.1"},
    //         {"//vehicle3": "0.6.0.1"}
    //     ],
    //     "Van_4": [
    //         {"//vehicle1": "head"},
    //         {"//vehicle2": "head"},
    //         {"//vehicle3": "head"},
    //         {"//vehicle4": "head"},
    //         {"//vehicle5": "head"}
    //     ],
    //     "Van_5": [
    //         {"//vehicle1": "0.22.0.5"},
    //         {"//vehicle2": "0.22.6.0"}
    //     ]
    //     }
    // """

    // BundleHolder(def pipeline) {
    //     super(pipeline)
    //     // this.initializeFromString(this.initBundles)

    // }
    static String getWelcomeMessage() {
        return "Welcome to Jenkins Shared Libraries, ${this.name}!"
    }
}