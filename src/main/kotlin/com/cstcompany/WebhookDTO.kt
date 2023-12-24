
import com.google.gson.annotations.SerializedName
data class WebhookDTO(
    @SerializedName("after")
    val after: String,
    @SerializedName("base_ref")
    val baseRef: Any,
    @SerializedName("before")
    val before: String,
    @SerializedName("commits")
    val commits: List<Commit>,
    @SerializedName("compare")
    val compare: String,
    @SerializedName("created")
    val created: Boolean,
    @SerializedName("deleted")
    val deleted: Boolean,
    @SerializedName("forced")
    val forced: Boolean,
    @SerializedName("head_commit")
    val headCommit: HeadCommit,
    @SerializedName("pusher")
    val pusher: Pusher,
    @SerializedName("ref")
    val ref: String,
    @SerializedName("repository")
    val repository: Repository,
    @SerializedName("sender")
    val sender: Sender
)

data class Commit(
    @SerializedName("added")
    val added: List<Any>,
    @SerializedName("author")
    val author: Author,
    @SerializedName("committer")
    val committer: Committer,
    @SerializedName("distinct")
    val distinct: Boolean,
    @SerializedName("id")
    val id: String,
    @SerializedName("message")
    val message: String,
    @SerializedName("modified")
    val modified: List<String>,
    @SerializedName("removed")
    val removed: List<Any>,
    @SerializedName("timestamp")
    val timestamp: String,
    @SerializedName("tree_id")
    val treeId: String,
    @SerializedName("url")
    val url: String
)

data class HeadCommit(
    @SerializedName("added")
    val added: List<Any>,
    @SerializedName("author")
    val author: Author,
    @SerializedName("committer")
    val committer: Committer,
    @SerializedName("distinct")
    val distinct: Boolean,
    @SerializedName("id")
    val id: String,
    @SerializedName("message")
    val message: String,
    @SerializedName("modified")
    val modified: List<String>,
    @SerializedName("removed")
    val removed: List<Any>,
    @SerializedName("timestamp")
    val timestamp: String,
    @SerializedName("tree_id")
    val treeId: String,
    @SerializedName("url")
    val url: String
)

data class Pusher(
    @SerializedName("email")
    val email: String,
    @SerializedName("name")
    val name: String
)

data class Repository(
    @SerializedName("allow_forking")
    val allowForking: Boolean,
    @SerializedName("archive_url")
    val archiveUrl: String,
    @SerializedName("archived")
    val archived: Boolean,
    @SerializedName("assignees_url")
    val assigneesUrl: String,
    @SerializedName("blobs_url")
    val blobsUrl: String,
    @SerializedName("branches_url")
    val branchesUrl: String,
    @SerializedName("clone_url")
    val cloneUrl: String,
    @SerializedName("collaborators_url")
    val collaboratorsUrl: String,
    @SerializedName("comments_url")
    val commentsUrl: String,
    @SerializedName("commits_url")
    val commitsUrl: String,
    @SerializedName("compare_url")
    val compareUrl: String,
    @SerializedName("contents_url")
    val contentsUrl: String,
    @SerializedName("contributors_url")
    val contributorsUrl: String,
    @SerializedName("created_at")
    val createdAt: Int,
    @SerializedName("default_branch")
    val defaultBranch: String,
    @SerializedName("deployments_url")
    val deploymentsUrl: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("disabled")
    val disabled: Boolean,
    @SerializedName("downloads_url")
    val downloadsUrl: String,
    @SerializedName("events_url")
    val eventsUrl: String,
    @SerializedName("fork")
    val fork: Boolean,
    @SerializedName("forks")
    val forks: Int,
    @SerializedName("forks_count")
    val forksCount: Int,
    @SerializedName("forks_url")
    val forksUrl: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("git_commits_url")
    val gitCommitsUrl: String,
    @SerializedName("git_refs_url")
    val gitRefsUrl: String,
    @SerializedName("git_tags_url")
    val gitTagsUrl: String,
    @SerializedName("git_url")
    val gitUrl: String,
    @SerializedName("has_discussions")
    val hasDiscussions: Boolean,
    @SerializedName("has_downloads")
    val hasDownloads: Boolean,
    @SerializedName("has_issues")
    val hasIssues: Boolean,
    @SerializedName("has_pages")
    val hasPages: Boolean,
    @SerializedName("has_projects")
    val hasProjects: Boolean,
    @SerializedName("has_wiki")
    val hasWiki: Boolean,
    @SerializedName("homepage")
    val homepage: Any,
    @SerializedName("hooks_url")
    val hooksUrl: String,
    @SerializedName("html_url")
    val htmlUrl: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("is_template")
    val isTemplate: Boolean,
    @SerializedName("issue_comment_url")
    val issueCommentUrl: String,
    @SerializedName("issue_events_url")
    val issueEventsUrl: String,
    @SerializedName("issues_url")
    val issuesUrl: String,
    @SerializedName("keys_url")
    val keysUrl: String,
    @SerializedName("labels_url")
    val labelsUrl: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("languages_url")
    val languagesUrl: String,
    @SerializedName("license")
    val license: Any,
    @SerializedName("master_branch")
    val masterBranch: String,
    @SerializedName("merges_url")
    val mergesUrl: String,
    @SerializedName("milestones_url")
    val milestonesUrl: String,
    @SerializedName("mirror_url")
    val mirrorUrl: Any,
    @SerializedName("name")
    val name: String,
    @SerializedName("node_id")
    val nodeId: String,
    @SerializedName("notifications_url")
    val notificationsUrl: String,
    @SerializedName("open_issues")
    val openIssues: Int,
    @SerializedName("open_issues_count")
    val openIssuesCount: Int,
    @SerializedName("owner")
    val owner: Owner,
    @SerializedName("private")
    val `private`: Boolean,
    @SerializedName("pulls_url")
    val pullsUrl: String,
    @SerializedName("pushed_at")
    val pushedAt: Int,
    @SerializedName("releases_url")
    val releasesUrl: String,
    @SerializedName("size")
    val size: Int,
    @SerializedName("ssh_url")
    val sshUrl: String,
    @SerializedName("stargazers")
    val stargazers: Int,
    @SerializedName("stargazers_count")
    val stargazersCount: Int,
    @SerializedName("stargazers_url")
    val stargazersUrl: String,
    @SerializedName("statuses_url")
    val statusesUrl: String,
    @SerializedName("subscribers_url")
    val subscribersUrl: String,
    @SerializedName("subscription_url")
    val subscriptionUrl: String,
    @SerializedName("svn_url")
    val svnUrl: String,
    @SerializedName("tags_url")
    val tagsUrl: String,
    @SerializedName("teams_url")
    val teamsUrl: String,
    @SerializedName("topics")
    val topics: List<Any>,
    @SerializedName("trees_url")
    val treesUrl: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("visibility")
    val visibility: String,
    @SerializedName("watchers")
    val watchers: Int,
    @SerializedName("watchers_count")
    val watchersCount: Int,
    @SerializedName("web_commit_signoff_required")
    val webCommitSignoffRequired: Boolean
)

data class Sender(
    @SerializedName("avatar_url")
    val avatarUrl: String,
    @SerializedName("events_url")
    val eventsUrl: String,
    @SerializedName("followers_url")
    val followersUrl: String,
    @SerializedName("following_url")
    val followingUrl: String,
    @SerializedName("gists_url")
    val gistsUrl: String,
    @SerializedName("gravatar_id")
    val gravatarId: String,
    @SerializedName("html_url")
    val htmlUrl: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("login")
    val login: String,
    @SerializedName("node_id")
    val nodeId: String,
    @SerializedName("organizations_url")
    val organizationsUrl: String,
    @SerializedName("received_events_url")
    val receivedEventsUrl: String,
    @SerializedName("repos_url")
    val reposUrl: String,
    @SerializedName("site_admin")
    val siteAdmin: Boolean,
    @SerializedName("starred_url")
    val starredUrl: String,
    @SerializedName("subscriptions_url")
    val subscriptionsUrl: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)

data class Author(
    @SerializedName("email")
    val email: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("username")
    val username: String
)

data class Committer(
    @SerializedName("email")
    val email: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("username")
    val username: String
)

data class Owner(
    @SerializedName("avatar_url")
    val avatarUrl: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("events_url")
    val eventsUrl: String,
    @SerializedName("followers_url")
    val followersUrl: String,
    @SerializedName("following_url")
    val followingUrl: String,
    @SerializedName("gists_url")
    val gistsUrl: String,
    @SerializedName("gravatar_id")
    val gravatarId: String,
    @SerializedName("html_url")
    val htmlUrl: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("login")
    val login: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("node_id")
    val nodeId: String,
    @SerializedName("organizations_url")
    val organizationsUrl: String,
    @SerializedName("received_events_url")
    val receivedEventsUrl: String,
    @SerializedName("repos_url")
    val reposUrl: String,
    @SerializedName("site_admin")
    val siteAdmin: Boolean,
    @SerializedName("starred_url")
    val starredUrl: String,
    @SerializedName("subscriptions_url")
    val subscriptionsUrl: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)