
package com.mattjohnson.teai5_1.pojo_launches;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mission_patch",
    "mission_patch_small",
    "reddit_campaign",
    "reddit_launch",
    "reddit_recovery",
    "reddit_media",
    "presskit",
    "article_link",
    "wikipedia",
    "video_link",
    "youtube_id",
    "flickr_images"
})
public class Links {

    @JsonProperty("mission_patch")
    private Object missionPatch;
    @JsonProperty("mission_patch_small")
    private Object missionPatchSmall;
    @JsonProperty("reddit_campaign")
    private String redditCampaign;
    @JsonProperty("reddit_launch")
    private Object redditLaunch;
    @JsonProperty("reddit_recovery")
    private Object redditRecovery;
    @JsonProperty("reddit_media")
    private Object redditMedia;
    @JsonProperty("presskit")
    private Object presskit;
    @JsonProperty("article_link")
    private Object articleLink;
    @JsonProperty("wikipedia")
    private Object wikipedia;
    @JsonProperty("video_link")
    private Object videoLink;
    @JsonProperty("youtube_id")
    private Object youtubeId;
    @JsonProperty("flickr_images")
    private List<Object> flickrImages = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mission_patch")
    public Object getMissionPatch() {
        return missionPatch;
    }

    @JsonProperty("mission_patch")
    public void setMissionPatch(Object missionPatch) {
        this.missionPatch = missionPatch;
    }

    @JsonProperty("mission_patch_small")
    public Object getMissionPatchSmall() {
        return missionPatchSmall;
    }

    @JsonProperty("mission_patch_small")
    public void setMissionPatchSmall(Object missionPatchSmall) {
        this.missionPatchSmall = missionPatchSmall;
    }

    @JsonProperty("reddit_campaign")
    public String getRedditCampaign() {
        return redditCampaign;
    }

    @JsonProperty("reddit_campaign")
    public void setRedditCampaign(String redditCampaign) {
        this.redditCampaign = redditCampaign;
    }

    @JsonProperty("reddit_launch")
    public Object getRedditLaunch() {
        return redditLaunch;
    }

    @JsonProperty("reddit_launch")
    public void setRedditLaunch(Object redditLaunch) {
        this.redditLaunch = redditLaunch;
    }

    @JsonProperty("reddit_recovery")
    public Object getRedditRecovery() {
        return redditRecovery;
    }

    @JsonProperty("reddit_recovery")
    public void setRedditRecovery(Object redditRecovery) {
        this.redditRecovery = redditRecovery;
    }

    @JsonProperty("reddit_media")
    public Object getRedditMedia() {
        return redditMedia;
    }

    @JsonProperty("reddit_media")
    public void setRedditMedia(Object redditMedia) {
        this.redditMedia = redditMedia;
    }

    @JsonProperty("presskit")
    public Object getPresskit() {
        return presskit;
    }

    @JsonProperty("presskit")
    public void setPresskit(Object presskit) {
        this.presskit = presskit;
    }

    @JsonProperty("article_link")
    public Object getArticleLink() {
        return articleLink;
    }

    @JsonProperty("article_link")
    public void setArticleLink(Object articleLink) {
        this.articleLink = articleLink;
    }

    @JsonProperty("wikipedia")
    public Object getWikipedia() {
        return wikipedia;
    }

    @JsonProperty("wikipedia")
    public void setWikipedia(Object wikipedia) {
        this.wikipedia = wikipedia;
    }

    @JsonProperty("video_link")
    public Object getVideoLink() {
        return videoLink;
    }

    @JsonProperty("video_link")
    public void setVideoLink(Object videoLink) {
        this.videoLink = videoLink;
    }

    @JsonProperty("youtube_id")
    public Object getYoutubeId() {
        return youtubeId;
    }

    @JsonProperty("youtube_id")
    public void setYoutubeId(Object youtubeId) {
        this.youtubeId = youtubeId;
    }

    @JsonProperty("flickr_images")
    public List<Object> getFlickrImages() {
        return flickrImages;
    }

    @JsonProperty("flickr_images")
    public void setFlickrImages(List<Object> flickrImages) {
        this.flickrImages = flickrImages;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
