const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isIdentifier(node)
        && node.parent
        && ts.isTypeReferenceNode(node.parent)
        && node.text === "Map"
    ) {
        return "js.collections.JsMap"
    }
    return null
}
