import PackageDescription

let package = Package(
    name: "libswiftandroid.so",
    targets: [
    ],
    dependencies: [
        .Package(url: "https://github.com/PureSwift/Android.git", majorVersion : 0)
        ]
)
