package com.arrival.ucs

class BundleHolder extends BundleHolderClazz {
    BundleHolder(def pipeline) {
        super(pipeline)
        _bundles = [
            "Mustang_v1": [
                new Project(pipeline, ""     , "0.0.42.0", "now"),
                new Project(pipeline, "FL"   , "0.0.14.0", "now"),
                new Project(pipeline, "FR"   , "0.0.12.0", "now"),
                new Project(pipeline, "RR"   , "0.0.8.0" , "now"),
                new Project(pipeline, "1"    , "0.0.9.0" , "now"),
                new Project(pipeline, "2"    , "0.0.11.0", "now")
            ],
            "Mustang_v2": [
                new Project(pipeline, "CU" , "0.0.22.0", "now"),
                new Project(pipeline, "D"  , "0.0.20.0", "now"),
                new Project(pipeline, "C"  , "0.0.18.0", "now"),
                new Project(pipeline, "F"  , "0.0.18.0", "now"),
                new Project(pipeline, "L"  , "0.0.18.0", "now"),
                new Project(pipeline, "R"  , "0.0.19.0", "now"),
                new Project(pipeline, "R"  , "0.0.18.0", "now")
            ],
            "Mustang_v3": [
                new Project(pipeline, "DCU" , "0.1.1.0", "now"),
                new Project(pipeline, "FL"  , "0.1.0.0", "now"),
                new Project(pipeline, "FR"  , "0.1.0.0", "now"),
                new Project(pipeline, "CD"  , "0.1.0.0", "now"),
                new Project(pipeline, "RR"  , "0.1.0.0", "now")
            ],
            "Mustang_v4": [
                new Project(pipeline, "CU" , "0.5.0.0", "now"),
                new Project(pipeline, "L"  , "0.1.8.0", "now"),
                new Project(pipeline, "R"  , "0.1.9.0", "now"),
                new Project(pipeline, "D"  , "0.1.8.0", "now"),
                new Project(pipeline, "C"  , "0.1.9.0", "now"),
                new Project(pipeline, "R"  , "0.1.9.0", "now"),
                new Project(pipeline, "D"  , "0.1.8.0", "now"),
                new Project(pipeline, "P"  , "0.1.8.0", "now")
            ],
            "Mustang_v5": [
                new Project(pipeline, "" , "0.23.1.7", "now"),
                new Project(pipeline, "5", "0.23.1.3", "now")
            ],
            "Mustang_v6": [
                new Project(pipeline, "" , "0.23.1.7", "now"),
                new Project(pipeline, "6", "0.23.1.1", "now")
            ]
        ]
        this._defaultVehicle = 'Mustang_v6'
    }
}