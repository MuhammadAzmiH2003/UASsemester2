package model;

public class GooglePlay {
    private String author;
    private String category;
    private String changelog;
    private String contentRating;
    private String datepublished;
    private int datePublishedIso;
    private String description;
    private String shortDescription;
    private int filesize;
    private String icon;
    private boolean inAppBilling;
    private String name;
    private int numDowload;
    private  String operationsystem;

    public GooglePlay(){

    }

    public GooglePlay(String author,String category,String changelog,String contentRating,String datepublished,int datePublishedIso,
                      String description,String shortDescription,int filesize,String icon,boolean inAppBilling,String name,int numDowload,String operationsystem){

        this.author=author;
        this.category=category;
        this.changelog=changelog;
        this.contentRating = contentRating;
        this.datepublished = datepublished;
        this.datePublishedIso=datePublishedIso;
        this.description=description;
        this.shortDescription=shortDescription;
        this.filesize = filesize;
        this.icon=icon;
        this.inAppBilling=inAppBilling;
        this.name=name;
        this.numDowload=numDowload;
        this.operationsystem=operationsystem;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getChangelog() {
        return changelog;
    }

    public void setChangelog(String changelog) {
        this.changelog = changelog;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating= contentRating;
    }

    public String getDatePublished() {
        return datepublished;
    }

    public void setDatePublished(String datePublished) {
        this.datepublished= datePublished;
    }

    public int getDatePublishedIso() {
        return datePublishedIso;
    }

    public void setDatePublishedIso(int datePublishedIso) {
        this.datePublishedIso = datePublishedIso;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public int getFileSize() {
        return filesize;
    }

    public void setFileSize(int fileSize) {
        this.filesize = fileSize;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getInAppBiling() {
        return inAppBilling;
    }

    public void setInAppBiling(Boolean inAppBiling) {
        this.inAppBilling = inAppBiling;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumDownloads() {
        return numDowload;
    }

    public void setNumDownloads(int numDownloads) {
        this.numDowload = numDownloads;
    }

    public String getOperatingSystem() {
        return operationsystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operationsystem = operatingSystem;
    }


}




