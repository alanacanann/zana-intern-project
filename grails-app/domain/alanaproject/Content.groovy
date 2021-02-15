package alanaproject

class Content {

    String title
    String description

    static belongsTo = [entity: Entity]

    static constraints = {
    }
}
