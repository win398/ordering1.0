package cn.esileme.model;

import java.util.List;

public class QueryVo {
    private int pageNum;
    private int kid;
    private int sid;
    private int fid;
    private int uid;
    private String keyword;
    private int oid;
    private List<Fcom> evaList;

    public List<Fcom> getEvaList() {
        return evaList;
    }

    public void setEvaList(List<Fcom> evaList) {
        this.evaList = evaList;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getKid() {
        return kid;
    }

    public void setKid(int kid) {
        this.kid = kid;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}
