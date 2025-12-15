// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "CapacitorProxyNetworkDetails",
    platforms: [.iOS(.v14)],
    products: [
        .library(
            name: "CapacitorProxyNetworkDetails",
            targets: ["ProxyDetailsPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", from: "7.0.0")
    ],
    targets: [
        .target(
            name: "ProxyDetailsPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/ProxyDetailsPlugin"),
        .testTarget(
            name: "ProxyDetailsPluginTests",
            dependencies: ["ProxyDetailsPlugin"],
            path: "ios/Tests/ProxyDetailsPluginTests")
    ]
)