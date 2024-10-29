# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        # Helper function to perform an in-order traversal and collect elements in sorted order
        def in_order_traversal(node):
            if not node:
                return []
            return in_order_traversal(node.left) + [node.val] + in_order_traversal(node.right)

        sorted_elements = in_order_traversal(root)  # Collect elements in sorted order
        return sorted_elements[k - 1]  # Return the kth smallest element

# Example usage:
# Create a TreeNode class or use your existing TreeNode definition and initialize a binary search tree.
# Call kthSmallest on a Solution instance with the root and k values.

    