package com.arrival.ucs


class BundleHolder extends BundleHolderClazz {
    BundleHolder(def pipeline) {
        super(pipeline)
        _bundles = [
            "Van_1": [
                new Project(pipeline, "//vehicle11", "0.0.9.0", "now"),
                new Project(pipeline, "//vehicle12", "0.0.9.0", "now")
            ],
            "Van_2": [
                new Project(pipeline, "//vehicle21", "0.2.0.0", "now")
            ],
            "Van_3": [
                new Project(pipeline, "//vehicle31", "0.13.0.2", "now"),
                new Project(pipeline, "//vehicle32", "0.5.0.1", "now"),
                new Project(pipeline, "//vehicle33", "0.6.0.1", "now")
            ],
            "Van_4": [
                new Project(pipeline, "//vehicle41", "head", "now"),
                new Project(pipeline, "//vehicle42", "head", "now"),
                new Project(pipeline, "//vehicle43", "head", "now"),
                new Project(pipeline, "//vehicle44", "head", "now"),
                new Project(pipeline, "//vehicle45", "head", "now")
            ],
            "Van_5": [
                new Project(pipeline, "//vehicle51", "0.22.0.5", "now"),
                new Project(pipeline, "//vehicle52", "0.22.6.0", "now")
            ]
        ]
        this.defaultVehicle = 'Van_4'
    }

    static BundleHolder createInitializedInstance() {
        BundleHolder holder = new BundleHolder()
        holder.initializeFromString(holder.initBundles)
        return holder
    }
}

// """
//                 {
//             "Van_1": [
//                 {"//vehicle1": "0.0.9.0"},
//                 {"//vehicle2": "0.0.9.0"}
//             ],
//             "Van_2": [
//                 {"//vehicle1": "0.2.0.0"}
//             ],
//             "Van_3": [
//                 {"//vehicle1": "0.13.0.2"},
//                 {"//vehicle2": "0.5.0.1"},
//                 {"//vehicle3": "0.6.0.1"}
//             ],
//             "Van_4": [
//                 {"//vehicle1": "head"},
//                 {"//vehicle2": "head"},
//                 {"//vehicle3": "head"},
//                 {"//vehicle4": "head"},
//                 {"//vehicle5": "head"}
//             ],
//             "Van_5": [
//                 {"//vehicle1": "0.22.0.5"},
//                 {"//vehicle2": "0.22.6.0"}
//             ]
//             }
//         """