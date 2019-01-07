package com.netease.audioroom.demo.base;

/**
 * 观众行为
 */
public interface IAudience {


    /**
     * 进入IM 聊天室
     *
     * @param roomId 聊天室ID
     */
    void enterChatRoom(String roomId);


    /**
     * 请求连麦
     */
    void requestLink();


    /**
     * 取消连麦请求
     */
    void cancelLinkRequest();

    /**
     * 主播拒绝连麦
     */
    void linkBeRejected();


    /**
     * 主播同意连麦（上麦）
     */
    void linkBeAccept();


    /**
     * 被主播抱麦（不可拒绝）
     */
    void beInvitedLink();

    /**
     * 连麦过程中被踢
     */
    void beRemoved();


    /**
     * 主动下麦
     */
    void cancelLink();


    /**
     * 被主播禁言
     */
    void beMutedText();


    /**
     * 被主播屏蔽语音
     */
    void beMutedAudio();
}
