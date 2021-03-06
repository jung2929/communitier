package gachon.mobile.programming.android.finalproject.models;

public class MenuData {
    private final int groupId;
    private int itemId;
    private final int order;
    private String title;
    private Integer resourceIcon;

    public MenuData(final int groupId, final int order) {
        this.groupId = groupId;
        this.order = order;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getResourceIcon() {
        return resourceIcon;
    }

    public void setResourceIcon(Integer resourceIcon) {
        this.resourceIcon = resourceIcon;
    }

    public int getGroupId() {
        return groupId;
    }

    public int getOrder() {
        return order;
    }
}
