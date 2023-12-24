import com.google.gson.Gson

fun generateJson(): WebhookDTO {
    val jsonString = """
      {
          "ref": "refs/heads/test",
          "before": "a2e7c4350b074982c6c099b16520ce02f174cb5f",
          "after": "47c50653078b85b1949a1f6385ddec4312c30430",
          "repository": {
            "id": 446606667,
            "node_id": "R_kgDOGp6tSw",
            "name": "WebHookUpdates",
            "full_name": "pacsinta/WebHookUpdates",
            "private": false,
            "owner": {
              "name": "pacsinta",
              "email": "61376206+pacsinta@users.noreply.github.com",
              "login": "pacsinta",
              "id": 61376206,
              "node_id": "MDQ6VXNlcjYxMzc2MjA2",
              "avatar_url": "https://avatars.githubusercontent.com/u/61376206?v=4",
              "gravatar_id": "",
              "url": "https://api.github.com/users/pacsinta",
              "html_url": "https://github.com/pacsinta",
              "followers_url": "https://api.github.com/users/pacsinta/followers",
              "following_url": "https://api.github.com/users/pacsinta/following{/other_user}",
              "gists_url": "https://api.github.com/users/pacsinta/gists{/gist_id}",
              "starred_url": "https://api.github.com/users/pacsinta/starred{/owner}{/repo}",
              "subscriptions_url": "https://api.github.com/users/pacsinta/subscriptions",
              "organizations_url": "https://api.github.com/users/pacsinta/orgs",
              "repos_url": "https://api.github.com/users/pacsinta/repos",
              "events_url": "https://api.github.com/users/pacsinta/events{/privacy}",
              "received_events_url": "https://api.github.com/users/pacsinta/received_events",
              "type": "User",
              "site_admin": false
            },
            "html_url": "https://github.com/pacsinta/WebHookUpdates",
            "description": "This script automatically updates my github projects on git push.",
            "fork": false,
            "url": "https://github.com/pacsinta/WebHookUpdates",
            "forks_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/forks",
            "keys_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/keys{/key_id}",
            "collaborators_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/collaborators{/collaborator}",
            "teams_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/teams",
            "hooks_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/hooks",
            "issue_events_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/issues/events{/number}",
            "events_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/events",
            "assignees_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/assignees{/user}",
            "branches_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/branches{/branch}",
            "tags_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/tags",
            "blobs_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/git/blobs{/sha}",
            "git_tags_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/git/tags{/sha}",
            "git_refs_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/git/refs{/sha}",
            "trees_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/git/trees{/sha}",
            "statuses_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/statuses/{sha}",
            "languages_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/languages",
            "stargazers_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/stargazers",
            "contributors_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/contributors",
            "subscribers_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/subscribers",
            "subscription_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/subscription",
            "commits_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/commits{/sha}",
            "git_commits_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/git/commits{/sha}",
            "comments_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/comments{/number}",
            "issue_comment_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/issues/comments{/number}",
            "contents_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/contents/{+path}",
            "compare_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/compare/{base}...{head}",
            "merges_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/merges",
            "archive_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/{archive_format}{/ref}",
            "downloads_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/downloads",
            "issues_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/issues{/number}",
            "pulls_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/pulls{/number}",
            "milestones_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/milestones{/number}",
            "notifications_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/notifications{?since,all,participating}",
            "labels_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/labels{/name}",
            "releases_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/releases{/id}",
            "deployments_url": "https://api.github.com/repos/pacsinta/WebHookUpdates/deployments",
            "created_at": 1641855149,
            "updated_at": "2023-12-21T22:21:32Z",
            "pushed_at": 1703370866,
            "git_url": "git://github.com/pacsinta/WebHookUpdates.git",
            "ssh_url": "git@github.com:pacsinta/WebHookUpdates.git",
            "clone_url": "https://github.com/pacsinta/WebHookUpdates.git",
            "svn_url": "https://github.com/pacsinta/WebHookUpdates",
            "homepage": null,
            "size": 604,
            "stargazers_count": 0,
            "watchers_count": 0,
            "language": "Python",
            "has_issues": true,
            "has_projects": true,
            "has_downloads": true,
            "has_wiki": true,
            "has_pages": false,
            "has_discussions": false,
            "forks_count": 0,
            "mirror_url": null,
            "archived": false,
            "disabled": false,
            "open_issues_count": 0,
            "license": null,
            "allow_forking": true,
            "is_template": false,
            "web_commit_signoff_required": false,
            "topics": [
        
            ],
            "visibility": "public",
            "forks": 0,
            "open_issues": 0,
            "watchers": 0,
            "default_branch": "main",
            "stargazers": 0,
            "master_branch": "main"
          },
          "pusher": {
            "name": "pacsinta",
            "email": "61376206+pacsinta@users.noreply.github.com"
          },
          "sender": {
            "login": "pacsinta",
            "id": 61376206,
            "node_id": "MDQ6VXNlcjYxMzc2MjA2",
            "avatar_url": "https://avatars.githubusercontent.com/u/61376206?v=4",
            "gravatar_id": "",
            "url": "https://api.github.com/users/pacsinta",
            "html_url": "https://github.com/pacsinta",
            "followers_url": "https://api.github.com/users/pacsinta/followers",
            "following_url": "https://api.github.com/users/pacsinta/following{/other_user}",
            "gists_url": "https://api.github.com/users/pacsinta/gists{/gist_id}",
            "starred_url": "https://api.github.com/users/pacsinta/starred{/owner}{/repo}",
            "subscriptions_url": "https://api.github.com/users/pacsinta/subscriptions",
            "organizations_url": "https://api.github.com/users/pacsinta/orgs",
            "repos_url": "https://api.github.com/users/pacsinta/repos",
            "events_url": "https://api.github.com/users/pacsinta/events{/privacy}",
            "received_events_url": "https://api.github.com/users/pacsinta/received_events",
            "type": "User",
            "site_admin": false
          },
          "created": false,
          "deleted": false,
          "forced": false,
          "base_ref": null,
          "compare": "https://github.com/pacsinta/WebHookUpdates/compare/a2e7c4350b07...47c50653078b",
          "commits": [
            {
              "id": "47c50653078b85b1949a1f6385ddec4312c30430",
              "tree_id": "86adb27729498e596c6238b15b4163faf689ab0a",
              "distinct": true,
              "message": "Test push",
              "timestamp": "2023-12-23T23:34:40+01:00",
              "url": "https://github.com/pacsinta/WebHookUpdates/commit/47c50653078b85b1949a1f6385ddec4312c30430",
              "author": {
                "name": "Patrik Csikós",
                "email": "61376206+pacsinta@users.noreply.github.com",
                "username": "pacsinta"
              },
              "committer": {
                "name": "Patrik Csikós",
                "email": "61376206+pacsinta@users.noreply.github.com",
                "username": "pacsinta"
              },
              "added": [
        
              ],
              "removed": [
        
              ],
              "modified": [
                "README.md"
              ]
            }
          ],
          "head_commit": {
            "id": "47c50653078b85b1949a1f6385ddec4312c30430",
            "tree_id": "86adb27729498e596c6238b15b4163faf689ab0a",
            "distinct": true,
            "message": "Test push",
            "timestamp": "2023-12-23T23:34:40+01:00",
            "url": "https://github.com/pacsinta/WebHookUpdates/commit/47c50653078b85b1949a1f6385ddec4312c30430",
            "author": {
              "name": "Patrik Csikós",
              "email": "61376206+pacsinta@users.noreply.github.com",
              "username": "pacsinta"
            },
            "committer": {
              "name": "Patrik Csikós",
              "email": "61376206+pacsinta@users.noreply.github.com",
              "username": "pacsinta"
            },
            "added": [
        
            ],
            "removed": [
        
            ],
            "modified": [
              "README.md"
            ]
          }
        }
    """.trimIndent()
    return Gson().fromJson(jsonString, WebhookDTO::class.java)
}