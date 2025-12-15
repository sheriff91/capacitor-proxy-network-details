import Foundation

@objc public class ProxyDetails: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
