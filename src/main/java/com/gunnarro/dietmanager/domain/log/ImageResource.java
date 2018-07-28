package com.gunnarro.dietmanager.domain.log;

public class ImageResource {

    private Integer id;
    private String name;
    private String description;
    private String path;
    private String type;
    private long createdTimeMs;
    
    public ImageResource(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ImageResource [path=");
        builder.append(path);
        builder.append("]");
        return builder.toString();
    }

}
