'use strict';

var mainList = document.querySelector('#main_container');
var http = new XMLHttpRequest();
var postIndex = 1;


http.onreadystatechange = function() {
    if (http.readyState === 4 && http.status === 200) {
        var fullDataArray = JSON.parse(http.response);
        console.log(fullDataArray);
        for (var i = 0; i < fullDataArray.posts.length; i++) {
            postCreate(fullDataArray.posts[i]);
        }
    }
}

var postCreate = function(post){
    var postContainer = document.createElement('div');
    postContainer.setAttribute('class', 'post_container');
    mainList.appendChild(postContainer);
    postIndex++;

    var postIndexNumber = document.createElement('span');
    postIndexNumber.setAttribute('class', 'post_index_number');
    postIndexNumber.innerHTML = postIndex;
    postContainer.appendChild(postIndexNumber);

    var postVote = document.createElement('div');
    postVote.setAttribute('class', 'post_vote');
    postContainer.appendChild(postVote);

    var postVoteUp = document.createElement('div');
    postVoteUp.setAttribute('class', 'post_vote_up');
    postVote.appendChild(postVoteUp);

    var postVoteIndex = document.createElement('div');
    postVoteIndex.setAttribute('class', 'post_vote_index');
    postVote.appendChild(postVoteIndex);

    var postInfoContainer = document.createElement('div');
    postInfoContainer.setAttribute('class', 'post_info_container');
    postContainer.appendChild(postInfoContainer);

    var postTitle = document.createElement('p');
    postTitle.setAttribute('class', 'post_title');
    postTitle.innerHTML = post.title;
    postInfoContainer.appendChild(postTitle);

    var postDateAndName = document.createElement('p');
    postDateAndName.setAttribute('class', 'post_date_and_name');
    postDateAndName.innerHTML = '' + ' anonymus';
    postInfoContainer.appendChild(postDateAndName);

    var postEditContainer = document.createElement('ul');
    postEditContainer.setAttribute('class', 'post_edit_container');
    postInfoContainer.appendChild(postEditContainer);

    var postModify = document.createElement('li');
    postModify.setAttribute('class', 'post_modify');
    postModify.innerHTML = 'modify';
    postEditContainer.appendChild(postModify);

    var postRemove = document.createElement('li');
    postRemove.setAttribute('class', 'post_remove');
    postRemove.innerHTML = 'remove';
    postEditContainer.appendChild(postRemove);
}
http.open('GET', 'http://10.27.6.196:8080/post');
http.send();