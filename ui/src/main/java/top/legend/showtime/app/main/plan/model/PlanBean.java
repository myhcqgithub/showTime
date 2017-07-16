package top.legend.showtime.app.main.plan.model;

import top.legend.commonlibrary.base.adapter.MuchItemEntity;
import top.legend.showtime.R;

/**
 * Created by Legend on 2017/7/16.
 */

public class PlanBean {
    private String title;
    private String content;
    private String language;
    private Long createDate;
    private Integer state;

    public PlanBean(String title, String content, String language) {
        this.title = title;
        this.content = content;
        this.language = language;
        this.createDate = System.currentTimeMillis();
        this.state = PlanStateConstant.PLAN_STATE_DEFAULT;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public static class PlanStateConstant {
        public static final Integer PLAN_STATE_DEFAULT = 0;
        public static final Integer PLAN_STATE_ING = 1;
        public static final Integer PLAN_STATE_COMPLETE = 1;
    }
}
