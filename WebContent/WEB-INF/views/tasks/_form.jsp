<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- タスク入力フォーム -->
<label for="content">新しいTASKを入力してください。</label><br />
<!-- リクエストスコープから初期値を参照 -->
<input type="text" name="content" value="${task.content}"/>
<br/><br/>

<input type="hidden" name="_token" value="${_token }"/>
<button type="submit">TASK 追加</button>
