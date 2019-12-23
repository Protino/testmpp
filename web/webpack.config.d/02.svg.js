const path = require("path");

config.module.rules.push(
    {
        test: /\.svg$/,
        loader: "svg-inline-loader"
    }
);