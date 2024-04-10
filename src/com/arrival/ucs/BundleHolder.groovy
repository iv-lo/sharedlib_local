package com.arrival.ucs


class BundleHolder extends BundleHolderClazz {
    BundleHolder(def pipeline) {
        super(pipeline)
        _bundles = [
            "Van_1": [
                new Project(pipeline, "//vehicle1", "0.0.9.0", "now"),
                new Project(pipeline, "//vehicle1", "0.0.9.0", "now")
            ],
            "Van_2": [
                new Project(pipeline, "//vehicle1", "0.2.0.0", "now")
            ],
            "Van_3": [
                new Project(pipeline, "//vehicle1", "0.13.0.2", "now"),
                new Project(pipeline, "//vehicle2", "0.5.0.1", "now"),
                new Project(pipeline, "//vehicle3", "0.6.0.1", "now")
            ],
            "Van_4": [
                new Project(pipeline, "//vehicle1", "head", "now"),
                new Project(pipeline, "//vehicle2", "head", "now"),
                new Project(pipeline, "//vehicle3", "head", "now"),
                new Project(pipeline, "//vehicle4", "head", "now"),
                new Project(pipeline, "//vehicle5", "head", "now")
            ],
            "Van_5": [
                new Project(pipeline, "//vehicle1", "0.22.0.5", "now"),
                new Project(pipeline, "//vehicle2", "0.22.6.0", "now")
            ]
        ]
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