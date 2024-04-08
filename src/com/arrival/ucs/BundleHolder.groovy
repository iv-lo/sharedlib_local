package com.arrival.ucs


class BundleHolder extends BundleHolderClazz {
    BundleHolder(def pipeline) {
        super(pipeline)
        this.initBundles = """
        {
            "Van_1": [
                {
                    "Component": "//vehicle1",
                    "Version": "0.0.9.0",
                    "Commit": "now"
                },
                {
                    "Component": "//vehicle1",
                    "Version": "0.0.9.0",
                    "Commit": "now"
                }
            ],
            "Van_2": [
                {
                    "Component": "//vehicle1",
                    "Version": "0.2.0.0",
                    "Commit": "now"
                }
            ],
            "Van_3": [
                {
                    "Component": "//vehicle1",
                    "Version": "0.13.0.2",
                    "Commit": "now"
                },
                {
                    "Component": "//vehicle2",
                    "Version": "0.5.0.1",
                    "Commit": "now"
                },
                {
                    "Component": "//vehicle3",
                    "Version": "0.6.0.1",
                    "Commit": "now"
                }
            ],
            "Van_4": [
                {
                    "Component": "//vehicle1",
                    "Version": "head",
                    "Commit": "now"
                },
                {
                    "Component": "//vehicle2",
                    "Version": "head",
                    "Commit": "now"
                },
                {
                    "Component": "//vehicle3",
                    "Version": "head",
                    "Commit": "now"
                },
                {
                    "Component": "//vehicle4",
                    "Version": "head",
                    "Commit": "now"
                },
                {
                    "Component": "//vehicle5",
                    "Version": "head",
                    "Commit": "now"
                }
            ],
            "Van_5": [
                {
                    "Component": "//vehicle1",
                    "Version": "0.22.0.5",
                    "Commit": "now"
                },
                {
                    "Component": "//vehicle2",
                    "Version": "0.22.6.0",
                    "Commit": "now"
                }
            ]
        }
        """
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